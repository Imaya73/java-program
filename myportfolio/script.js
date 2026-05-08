
const navLinks = document.querySelectorAll('.nav-links a');

navLinks.forEach(link=>{
  link.addEventListener('click', (e)=>{
    e.preventDefault();
    const href = link.getAttribute('href');
    const target = document.querySelector(href);
    if(!target) return;
    const headerOffset = document.querySelector('.site-header').offsetHeight;
    const elementPosition = target.getBoundingClientRect().top + window.pageYOffset;
    const offsetPosition = elementPosition - headerOffset - 12; 
    window.scrollTo({ top: offsetPosition, behavior: 'smooth' });
  });
});


const sections = document.querySelectorAll('section[id]');
const options = {
  root: null,
  rootMargin: `-40% 0px -40% 0px`,
  threshold: 0
};

const observer = new IntersectionObserver((entries)=>{
  entries.forEach(entry=>{
    const id = entry.target.getAttribute('id');
    const navLink = document.querySelector(`.nav-links a[href="#${id}"]`);
    if(entry.isIntersecting){
      navLinks.forEach(a=>a.classList.remove('active'));
      if(navLink) navLink.classList.add('active');
    }
  });
}, options);

sections.forEach(s => observer.observe(s));


const form = document.querySelector('.contact-form');
if(form){
  form.addEventListener('submit', (e)=>{
    e.preventDefault();
    alert('Thank you! Your message has been received. (This is a demo — add backend to save messages.)');
    form.reset();
  });
}
